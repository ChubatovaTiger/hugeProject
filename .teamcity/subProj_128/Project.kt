package subProj_128

import subProj_128.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_128")
    name = "subProj 128"

    buildType(subProj_bt_128_4)
    buildType(subProj_bt_128_3)
    buildType(subProj_bt_128_2)
    buildType(subProj_bt_128_1)
    buildType(subProj_bt_128_0)
    buildType(subProj_bt_128_5)
})
