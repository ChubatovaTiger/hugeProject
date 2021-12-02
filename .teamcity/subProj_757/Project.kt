package subProj_757

import subProj_757.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_757")
    name = "subProj 757"

    buildType(subProj_bt_757_3)
    buildType(subProj_bt_757_4)
    buildType(subProj_bt_757_5)
    buildType(subProj_bt_757_0)
    buildType(subProj_bt_757_1)
    buildType(subProj_bt_757_2)
})
