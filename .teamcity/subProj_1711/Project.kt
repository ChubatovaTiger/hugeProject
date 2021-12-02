package subProj_1711

import subProj_1711.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1711")
    name = "subProj 1711"

    buildType(subProj_bt_1711_1)
    buildType(subProj_bt_1711_0)
    buildType(subProj_bt_1711_3)
    buildType(subProj_bt_1711_2)
    buildType(subProj_bt_1711_5)
    buildType(subProj_bt_1711_4)
})
