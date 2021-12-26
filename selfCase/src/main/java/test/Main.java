package test;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

/**
 * @author dongchen
 * @Data 2020/9/1
 * @Time 11:38
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        var res = [{
//            code: 1,
//                    name: "citx",
//                    children: [{
//                code: 1,
//                        name: "k8s",
//                        children: [
//                {
//                    code: 1,
//                            name: "processors"
//                },
//                {
//                    code: 1,
//                            name: "bootstrap",
//                        children: [
//                    {
//                        code: 1,
//                                name: "entry",
//                            children: [{
//                        code: 1,
//                                name: "endpoints",
//                                children: [{
//                            code: 1,
//                                    name: "resource"
//                        }]
//                    }]
//                    },
//                    {
//                        code: 1,
//                                name: "mointor",
//                            children: [{
//                        code: 1,
//                                name: "resource"
//                    }]
//                    }
//            ]
//                }
//        ]
//            }]
//        }]
//
//        function treeFindPath (tree, func,  path = []) {
//
//            if (!tree) return []
//            for (const data of tree) {
//                console.log(data)
//                console.log("##########################")
//                // 这里按照你的需求来存放最后返回的内容吧
//                path.push(data.name)
//                console.log(path)
//                if (func(data)) return path
//                if (data.children) {
//      const findChildren = treeFindPath(data.children, func, path)
//                    if (findChildren.length) return findChildren
//                }
//                path.pop()
//            }
//            return []
//        }
//        console.log(treeFindPath(res,data=> data.name==='resource'))
//

    }
}
