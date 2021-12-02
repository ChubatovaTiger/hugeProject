package subProj_1618

import subProj_1618.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1618")
    name = "subProj 1618"

    buildType(subProj_bt_1618_5)
    buildType(subProj_bt_1618_4)
    buildType(subProj_bt_1618_3)
    buildType(subProj_bt_1618_2)
    buildType(subProj_bt_1618_1)
    buildType(subProj_bt_1618_0)
})
