package subProj_1296

import subProj_1296.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1296")
    name = "subProj 1296"

    buildType(subProj_bt_1296_5)
    buildType(subProj_bt_1296_4)
    buildType(subProj_bt_1296_3)
    buildType(subProj_bt_1296_2)
    buildType(subProj_bt_1296_1)
    buildType(subProj_bt_1296_0)
})
