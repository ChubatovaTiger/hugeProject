package subProj_1326

import subProj_1326.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1326")
    name = "subProj 1326"

    buildType(subProj_bt_1326_4)
    buildType(subProj_bt_1326_5)
    buildType(subProj_bt_1326_2)
    buildType(subProj_bt_1326_3)
    buildType(subProj_bt_1326_0)
    buildType(subProj_bt_1326_1)
})
