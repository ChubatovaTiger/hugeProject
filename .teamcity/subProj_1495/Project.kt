package subProj_1495

import subProj_1495.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1495")
    name = "subProj 1495"

    buildType(subProj_bt_1495_2)
    buildType(subProj_bt_1495_1)
    buildType(subProj_bt_1495_0)
    buildType(subProj_bt_1495_5)
    buildType(subProj_bt_1495_4)
    buildType(subProj_bt_1495_3)
})
