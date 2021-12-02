package subProj_572

import subProj_572.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_572")
    name = "subProj 572"

    buildType(subProj_bt_572_5)
    buildType(subProj_bt_572_4)
    buildType(subProj_bt_572_1)
    buildType(subProj_bt_572_0)
    buildType(subProj_bt_572_3)
    buildType(subProj_bt_572_2)
})
