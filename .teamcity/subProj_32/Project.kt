package subProj_32

import subProj_32.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_32")
    name = "subProj 32"

    buildType(subProj_bt_32_0)
    buildType(subProj_bt_32_1)
    buildType(subProj_bt_32_2)
    buildType(subProj_bt_32_3)
    buildType(subProj_bt_32_4)
    buildType(subProj_bt_32_5)
})
