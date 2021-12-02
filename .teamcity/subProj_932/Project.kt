package subProj_932

import subProj_932.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_932")
    name = "subProj 932"

    buildType(subProj_bt_932_4)
    buildType(subProj_bt_932_5)
    buildType(subProj_bt_932_0)
    buildType(subProj_bt_932_1)
    buildType(subProj_bt_932_2)
    buildType(subProj_bt_932_3)
})
