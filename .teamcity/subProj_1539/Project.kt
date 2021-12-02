package subProj_1539

import subProj_1539.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1539")
    name = "subProj 1539"

    buildType(subProj_bt_1539_2)
    buildType(subProj_bt_1539_3)
    buildType(subProj_bt_1539_0)
    buildType(subProj_bt_1539_1)
    buildType(subProj_bt_1539_4)
    buildType(subProj_bt_1539_5)
})
