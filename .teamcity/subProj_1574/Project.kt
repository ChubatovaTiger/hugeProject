package subProj_1574

import subProj_1574.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1574")
    name = "subProj 1574"

    buildType(subProj_bt_1574_0)
    buildType(subProj_bt_1574_5)
    buildType(subProj_bt_1574_1)
    buildType(subProj_bt_1574_2)
    buildType(subProj_bt_1574_3)
    buildType(subProj_bt_1574_4)
})
