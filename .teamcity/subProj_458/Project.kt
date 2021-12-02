package subProj_458

import subProj_458.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_458")
    name = "subProj 458"

    buildType(subProj_bt_458_0)
    buildType(subProj_bt_458_3)
    buildType(subProj_bt_458_4)
    buildType(subProj_bt_458_1)
    buildType(subProj_bt_458_2)
    buildType(subProj_bt_458_5)
})
