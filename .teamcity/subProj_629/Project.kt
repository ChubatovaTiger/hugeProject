package subProj_629

import subProj_629.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_629")
    name = "subProj 629"

    buildType(subProj_bt_629_4)
    buildType(subProj_bt_629_3)
    buildType(subProj_bt_629_5)
    buildType(subProj_bt_629_0)
    buildType(subProj_bt_629_2)
    buildType(subProj_bt_629_1)
})
