package subProj_1664

import subProj_1664.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1664")
    name = "subProj 1664"

    buildType(subProj_bt_1664_1)
    buildType(subProj_bt_1664_2)
    buildType(subProj_bt_1664_0)
    buildType(subProj_bt_1664_5)
    buildType(subProj_bt_1664_3)
    buildType(subProj_bt_1664_4)
})
