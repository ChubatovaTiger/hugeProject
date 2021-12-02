package subProj_321

import subProj_321.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_321")
    name = "subProj 321"

    buildType(subProj_bt_321_5)
    buildType(subProj_bt_321_4)
    buildType(subProj_bt_321_3)
    buildType(subProj_bt_321_2)
    buildType(subProj_bt_321_1)
    buildType(subProj_bt_321_0)
})
