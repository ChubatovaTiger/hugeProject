package subProj_1581

import subProj_1581.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1581")
    name = "subProj 1581"

    buildType(subProj_bt_1581_1)
    buildType(subProj_bt_1581_2)
    buildType(subProj_bt_1581_3)
    buildType(subProj_bt_1581_4)
    buildType(subProj_bt_1581_0)
    buildType(subProj_bt_1581_5)
})
