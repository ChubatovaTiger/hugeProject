package subProj_16

import subProj_16.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_16")
    name = "subProj 16"

    buildType(subProj_bt_16_4)
    buildType(subProj_bt_16_3)
    buildType(subProj_bt_16_2)
    buildType(subProj_bt_16_1)
    buildType(subProj_bt_16_0)
    buildType(subProj_bt_16_5)
})
