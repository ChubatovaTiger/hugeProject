package subProj_637

import subProj_637.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_637")
    name = "subProj 637"

    buildType(subProj_bt_637_3)
    buildType(subProj_bt_637_2)
    buildType(subProj_bt_637_5)
    buildType(subProj_bt_637_4)
    buildType(subProj_bt_637_1)
    buildType(subProj_bt_637_0)
})
