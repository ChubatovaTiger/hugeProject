package subProj_1982

import subProj_1982.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1982")
    name = "subProj 1982"

    buildType(subProj_bt_1982_5)
    buildType(subProj_bt_1982_4)
    buildType(subProj_bt_1982_1)
    buildType(subProj_bt_1982_0)
    buildType(subProj_bt_1982_3)
    buildType(subProj_bt_1982_2)
})
