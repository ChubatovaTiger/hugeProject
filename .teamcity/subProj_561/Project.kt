package subProj_561

import subProj_561.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_561")
    name = "subProj 561"

    buildType(subProj_bt_561_5)
    buildType(subProj_bt_561_4)
    buildType(subProj_bt_561_1)
    buildType(subProj_bt_561_0)
    buildType(subProj_bt_561_3)
    buildType(subProj_bt_561_2)
})
