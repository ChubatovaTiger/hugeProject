package subProj_1572

import subProj_1572.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1572")
    name = "subProj 1572"

    buildType(subProj_bt_1572_0)
    buildType(subProj_bt_1572_1)
    buildType(subProj_bt_1572_2)
    buildType(subProj_bt_1572_3)
    buildType(subProj_bt_1572_4)
    buildType(subProj_bt_1572_5)
})
