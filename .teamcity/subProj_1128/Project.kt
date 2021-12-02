package subProj_1128

import subProj_1128.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1128")
    name = "subProj 1128"

    buildType(subProj_bt_1128_1)
    buildType(subProj_bt_1128_0)
    buildType(subProj_bt_1128_3)
    buildType(subProj_bt_1128_2)
    buildType(subProj_bt_1128_5)
    buildType(subProj_bt_1128_4)
})
