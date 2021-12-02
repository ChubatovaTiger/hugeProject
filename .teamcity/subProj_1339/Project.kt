package subProj_1339

import subProj_1339.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1339")
    name = "subProj 1339"

    buildType(subProj_bt_1339_4)
    buildType(subProj_bt_1339_5)
    buildType(subProj_bt_1339_2)
    buildType(subProj_bt_1339_3)
    buildType(subProj_bt_1339_0)
    buildType(subProj_bt_1339_1)
})
