package subProj_526

import subProj_526.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_526")
    name = "subProj 526"

    buildType(subProj_bt_526_5)
    buildType(subProj_bt_526_4)
    buildType(subProj_bt_526_3)
    buildType(subProj_bt_526_2)
    buildType(subProj_bt_526_1)
    buildType(subProj_bt_526_0)
})
