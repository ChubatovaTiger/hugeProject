package subProj_326

import subProj_326.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_326")
    name = "subProj 326"

    buildType(subProj_bt_326_0)
    buildType(subProj_bt_326_4)
    buildType(subProj_bt_326_3)
    buildType(subProj_bt_326_2)
    buildType(subProj_bt_326_1)
    buildType(subProj_bt_326_5)
})
