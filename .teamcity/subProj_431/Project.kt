package subProj_431

import subProj_431.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_431")
    name = "subProj 431"

    buildType(subProj_bt_431_3)
    buildType(subProj_bt_431_2)
    buildType(subProj_bt_431_5)
    buildType(subProj_bt_431_4)
    buildType(subProj_bt_431_1)
    buildType(subProj_bt_431_0)
})
