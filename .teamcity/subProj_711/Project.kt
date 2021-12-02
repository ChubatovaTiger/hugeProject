package subProj_711

import subProj_711.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_711")
    name = "subProj 711"

    buildType(subProj_bt_711_5)
    buildType(subProj_bt_711_0)
    buildType(subProj_bt_711_4)
    buildType(subProj_bt_711_3)
    buildType(subProj_bt_711_2)
    buildType(subProj_bt_711_1)
})
