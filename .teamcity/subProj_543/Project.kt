package subProj_543

import subProj_543.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_543")
    name = "subProj 543"

    buildType(subProj_bt_543_0)
    buildType(subProj_bt_543_1)
    buildType(subProj_bt_543_2)
    buildType(subProj_bt_543_3)
    buildType(subProj_bt_543_4)
    buildType(subProj_bt_543_5)
})
