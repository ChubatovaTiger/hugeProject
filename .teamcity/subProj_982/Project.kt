package subProj_982

import subProj_982.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_982")
    name = "subProj 982"

    buildType(subProj_bt_982_0)
    buildType(subProj_bt_982_3)
    buildType(subProj_bt_982_4)
    buildType(subProj_bt_982_1)
    buildType(subProj_bt_982_2)
    buildType(subProj_bt_982_5)
})
