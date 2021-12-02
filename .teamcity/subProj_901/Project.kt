package subProj_901

import subProj_901.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_901")
    name = "subProj 901"

    buildType(subProj_bt_901_0)
    buildType(subProj_bt_901_1)
    buildType(subProj_bt_901_4)
    buildType(subProj_bt_901_5)
    buildType(subProj_bt_901_2)
    buildType(subProj_bt_901_3)
})
