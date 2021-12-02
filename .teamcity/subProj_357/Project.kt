package subProj_357

import subProj_357.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_357")
    name = "subProj 357"

    buildType(subProj_bt_357_3)
    buildType(subProj_bt_357_4)
    buildType(subProj_bt_357_5)
    buildType(subProj_bt_357_0)
    buildType(subProj_bt_357_1)
    buildType(subProj_bt_357_2)
})
