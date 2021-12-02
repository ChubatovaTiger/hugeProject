package subProj_663

import subProj_663.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_663")
    name = "subProj 663"

    buildType(subProj_bt_663_0)
    buildType(subProj_bt_663_5)
    buildType(subProj_bt_663_4)
    buildType(subProj_bt_663_3)
    buildType(subProj_bt_663_2)
    buildType(subProj_bt_663_1)
})
