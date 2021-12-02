package subProj_1626

import subProj_1626.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1626")
    name = "subProj 1626"

    buildType(subProj_bt_1626_1)
    buildType(subProj_bt_1626_2)
    buildType(subProj_bt_1626_3)
    buildType(subProj_bt_1626_4)
    buildType(subProj_bt_1626_5)
    buildType(subProj_bt_1626_0)
})
