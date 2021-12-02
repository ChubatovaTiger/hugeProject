package subProj_1680

import subProj_1680.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1680")
    name = "subProj 1680"

    buildType(subProj_bt_1680_0)
    buildType(subProj_bt_1680_4)
    buildType(subProj_bt_1680_3)
    buildType(subProj_bt_1680_2)
    buildType(subProj_bt_1680_1)
    buildType(subProj_bt_1680_5)
})
