package subProj_1691

import subProj_1691.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1691")
    name = "subProj 1691"

    buildType(subProj_bt_1691_0)
    buildType(subProj_bt_1691_4)
    buildType(subProj_bt_1691_3)
    buildType(subProj_bt_1691_2)
    buildType(subProj_bt_1691_1)
    buildType(subProj_bt_1691_5)
})
