package subProj_1576

import subProj_1576.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1576")
    name = "subProj 1576"

    buildType(subProj_bt_1576_3)
    buildType(subProj_bt_1576_4)
    buildType(subProj_bt_1576_5)
    buildType(subProj_bt_1576_0)
    buildType(subProj_bt_1576_1)
    buildType(subProj_bt_1576_2)
})
