package subProj_1690

import subProj_1690.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1690")
    name = "subProj 1690"

    buildType(subProj_bt_1690_1)
    buildType(subProj_bt_1690_0)
    buildType(subProj_bt_1690_5)
    buildType(subProj_bt_1690_4)
    buildType(subProj_bt_1690_3)
    buildType(subProj_bt_1690_2)
})
