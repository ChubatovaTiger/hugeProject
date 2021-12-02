package subProj_1631

import subProj_1631.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1631")
    name = "subProj 1631"

    buildType(subProj_bt_1631_0)
    buildType(subProj_bt_1631_1)
    buildType(subProj_bt_1631_2)
    buildType(subProj_bt_1631_3)
    buildType(subProj_bt_1631_4)
    buildType(subProj_bt_1631_5)
})
