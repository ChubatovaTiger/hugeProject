package subProj_552

import subProj_552.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_552")
    name = "subProj 552"

    buildType(subProj_bt_552_2)
    buildType(subProj_bt_552_3)
    buildType(subProj_bt_552_4)
    buildType(subProj_bt_552_5)
    buildType(subProj_bt_552_0)
    buildType(subProj_bt_552_1)
})
