package subProj_206

import subProj_206.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_206")
    name = "subProj 206"

    buildType(subProj_bt_206_0)
    buildType(subProj_bt_206_1)
    buildType(subProj_bt_206_2)
    buildType(subProj_bt_206_3)
    buildType(subProj_bt_206_4)
    buildType(subProj_bt_206_5)
})
