package subProj_103

import subProj_103.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_103")
    name = "subProj 103"

    buildType(subProj_bt_103_4)
    buildType(subProj_bt_103_5)
    buildType(subProj_bt_103_2)
    buildType(subProj_bt_103_3)
    buildType(subProj_bt_103_0)
    buildType(subProj_bt_103_1)
})
