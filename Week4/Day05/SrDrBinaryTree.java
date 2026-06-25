import java.util.*;

public class Codec {

    // Serialize
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");

        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    // Deserialize
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserializeHelper(queue);
    }

    private TreeNode deserializeHelper(Queue<String> queue) {

        String val = queue.poll();

        if (val.equals("null"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(val));

        root.left = deserializeHelper(queue);
        root.right = deserializeHelper(queue);

        return root;
    }
    }
