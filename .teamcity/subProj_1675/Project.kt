package subProj_1675

import subProj_1675.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1675")
    name = "subProj 1675"

    buildType(subProj_bt_1675_1)
    buildType(subProj_bt_1675_2)
    buildType(subProj_bt_1675_0)
    buildType(subProj_bt_1675_5)
    buildType(subProj_bt_1675_3)
    buildType(subProj_bt_1675_4)
})
