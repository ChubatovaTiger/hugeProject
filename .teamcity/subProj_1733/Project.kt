package subProj_1733

import subProj_1733.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1733")
    name = "subProj 1733"

    buildType(subProj_bt_1733_2)
    buildType(subProj_bt_1733_3)
    buildType(subProj_bt_1733_0)
    buildType(subProj_bt_1733_1)
    buildType(subProj_bt_1733_4)
    buildType(subProj_bt_1733_5)
})
