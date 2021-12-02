package subProj_1604

import subProj_1604.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1604")
    name = "subProj 1604"

    buildType(subProj_bt_1604_0)
    buildType(subProj_bt_1604_5)
    buildType(subProj_bt_1604_4)
    buildType(subProj_bt_1604_3)
    buildType(subProj_bt_1604_2)
    buildType(subProj_bt_1604_1)
})
