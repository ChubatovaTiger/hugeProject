package subProj_1580

import subProj_1580.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1580")
    name = "subProj 1580"

    buildType(subProj_bt_1580_2)
    buildType(subProj_bt_1580_3)
    buildType(subProj_bt_1580_4)
    buildType(subProj_bt_1580_5)
    buildType(subProj_bt_1580_0)
    buildType(subProj_bt_1580_1)
})
