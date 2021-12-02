package subProj_1554

import subProj_1554.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1554")
    name = "subProj 1554"

    buildType(subProj_bt_1554_2)
    buildType(subProj_bt_1554_1)
    buildType(subProj_bt_1554_0)
    buildType(subProj_bt_1554_5)
    buildType(subProj_bt_1554_4)
    buildType(subProj_bt_1554_3)
})
