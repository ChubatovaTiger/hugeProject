package subProj_882

import subProj_882.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_882")
    name = "subProj 882"

    buildType(subProj_bt_882_0)
    buildType(subProj_bt_882_1)
    buildType(subProj_bt_882_2)
    buildType(subProj_bt_882_3)
    buildType(subProj_bt_882_4)
    buildType(subProj_bt_882_5)
})
