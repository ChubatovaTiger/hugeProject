package subProj_86

import subProj_86.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_86")
    name = "subProj 86"

    buildType(subProj_bt_86_2)
    buildType(subProj_bt_86_3)
    buildType(subProj_bt_86_0)
    buildType(subProj_bt_86_1)
    buildType(subProj_bt_86_4)
    buildType(subProj_bt_86_5)
})
