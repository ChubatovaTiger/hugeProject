package subProj_1722

import subProj_1722.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1722")
    name = "subProj 1722"

    buildType(subProj_bt_1722_2)
    buildType(subProj_bt_1722_3)
    buildType(subProj_bt_1722_0)
    buildType(subProj_bt_1722_1)
    buildType(subProj_bt_1722_4)
    buildType(subProj_bt_1722_5)
})
