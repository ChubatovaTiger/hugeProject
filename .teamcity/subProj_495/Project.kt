package subProj_495

import subProj_495.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_495")
    name = "subProj 495"

    buildType(subProj_bt_495_4)
    buildType(subProj_bt_495_5)
    buildType(subProj_bt_495_0)
    buildType(subProj_bt_495_1)
    buildType(subProj_bt_495_2)
    buildType(subProj_bt_495_3)
})
