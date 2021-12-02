package subProj_1629

import subProj_1629.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1629")
    name = "subProj 1629"

    buildType(subProj_bt_1629_0)
    buildType(subProj_bt_1629_1)
    buildType(subProj_bt_1629_2)
    buildType(subProj_bt_1629_3)
    buildType(subProj_bt_1629_4)
    buildType(subProj_bt_1629_5)
})
